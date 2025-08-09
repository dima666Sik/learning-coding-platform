import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import AppNavbar from "./components/Navbar";
import HomePage from "./pages/HomePage";
import CoursesPage from "./pages/CoursesPage";
import CourseDetailPage from "./pages/CourseDetailPage";
import VideoDetailPage from "./pages/VideoDetailPage";
import ProfilePage from "./pages/ProfilePage";
import "./App.css";

export default function App() {
	return (
		<Router>
			<AppNavbar />
			<Routes>
				<Route path="/" element={<HomePage />} />
				<Route path="/courses" element={<CoursesPage />} />
				<Route path="/courses/:id" element={<CourseDetailPage />} />
				<Route
					path="/courses/:courseId/videos/:videoId"
					element={<VideoDetailPage />}
				/>
				<Route path="/profile" element={<ProfilePage />} />
			</Routes>
		</Router>
	);
}
