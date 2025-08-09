import { useSelector } from "react-redux";

export default function ProfilePage() {
	const user = useSelector((state) => state.user);

	return (
		<div className="container mt-4 profile-page main-container">
			<h2>User Profile</h2>
			<p>
				<b>Name:</b> {user.name}
			</p>
			<p>
				<b>Email:</b> {user.email}
			</p>
		</div>
	);
}
