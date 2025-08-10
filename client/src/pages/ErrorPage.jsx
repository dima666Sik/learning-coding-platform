export default function ErrorPage({ errorMessage }) {
	return (
		<div style={{ color: "red", padding: "1rem" }}>
			<h2>Ooops!</h2>
			<p>{errorMessage}</p>
		</div>
	);
}
