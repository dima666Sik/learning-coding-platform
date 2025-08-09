import { Link } from "react-router-dom";
import { Navbar, Nav, Container } from "react-bootstrap";
import { FaUserCircle } from "react-icons/fa";

export default function AppNavbar() {
	return (
		<Navbar bg="dark" variant="dark" expand="lg">
			<Container>
				<Navbar.Brand as={Link} to="/">
					Programming Learning
				</Navbar.Brand>
				<Navbar.Toggle />
				<Navbar.Collapse>
					<Nav className="me-auto">
						<Nav.Link as={Link} to="/courses">
							Courses
						</Nav.Link>
					</Nav>
					<Nav>
						<Nav.Link as={Link} to="/profile">
							<FaUserCircle size={24} />
						</Nav.Link>
					</Nav>
				</Navbar.Collapse>
			</Container>
		</Navbar>
	);
}
