import { useParams } from "react-router-dom";
import { useSelector, useDispatch } from "react-redux";
import { useState } from "react";
import { addComment } from "../redux/slices/videosSlice";

export default function VideoDetailPage() {
	const { courseId, videoId } = useParams();
	const video = useSelector((state) =>
		state.videos.videos[courseId]?.find((v) => v.id === videoId)
	);
	const dispatch = useDispatch();
	const [comment, setComment] = useState("");

	const handleAddComment = () => {
		if (comment.trim()) {
			dispatch(addComment({ courseId, videoId, comment }));
			setComment("");
		}
	};

	if (!video) return <p>Video not found</p>;

	return (
		<div className="container mt-4 main-container">
			<h3>{video.title}</h3>
			<div className="ratio ratio-16x9 mb-3">
				<iframe src={video.url} title={video.title} allowFullScreen></iframe>
			</div>
			<div className="comments-section">
				<h5>Comments</h5>
				<ul className="list-group mb-3">
					{video.comments.map((c, idx) => (
						<li key={idx} className="list-group-item">
							{c}
						</li>
					))}
				</ul>
				<div className="input-group">
					<input
						value={comment}
						onChange={(e) => setComment(e.target.value)}
						className="form-control"
						placeholder="Add a comment"
					/>
					<button onClick={handleAddComment} className="btn btn-primary">
						Post
					</button>
				</div>
			</div>
		</div>
	);
}
