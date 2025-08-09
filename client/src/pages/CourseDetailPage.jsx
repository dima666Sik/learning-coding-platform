import { useParams, Link } from "react-router-dom";
import { useSelector } from "react-redux";

export default function CourseDetailPage() {
	const { id } = useParams();
	const videos = useSelector((state) => state.videos.videos[id] || []);

	return (
		<div className="container mt-4 main-container">
			<h3>Course Videos</h3>
			<ul className="list-group">
				{videos.map((video) => (
					<li key={video.id} className="list-group-item">
						<Link to={`/courses/${id}/videos/${video.id}`}>{video.title}</Link>
					</li>
				))}
			</ul>
		</div>
	);
}
