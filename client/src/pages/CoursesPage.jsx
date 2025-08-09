import { useSelector } from "react-redux";
import { Link } from "react-router-dom";

export default function CoursesPage() {
	const courses = useSelector((state) => state.courses.courses);

	return (
		<div className="container d-flex flex-column align-items-center text-center mt-4 main-container">
			<h2>Courses</h2>
			<div className="row">
				{courses.map((course) => (
					<div key={course.id} className="col-md-4">
						<div className="card mb-3">
							<div className="card-body">
								<h5>{course.title}</h5>
								<p>{course.description}</p>
								<Link to={`/courses/${course.id}`} className="btn btn-primary">
									View Videos
								</Link>
							</div>
						</div>
					</div>
				))}
			</div>
		</div>
	);
}
