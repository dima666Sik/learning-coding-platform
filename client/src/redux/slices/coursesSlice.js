import { createSlice } from "@reduxjs/toolkit";

const initialState = {
	courses: [
		{ id: 1, title: "Java Basics", description: "Learn Java fundamentals" },
		{ id: 2, title: "React for Beginners", description: "Intro to React.js" },
		{ id: 2, title: "React for Beginners", description: "Intro to React.js" },
		{ id: 2, title: "React for Beginners", description: "Intro to React.js" },
		{ id: 2, title: "React for Beginners", description: "Intro to React.js" },
		{ id: 2, title: "React for Beginners", description: "Intro to React.js" },
	],
};

const coursesSlice = createSlice({
	name: "courses",
	initialState,
	reducers: {},
});

export default coursesSlice.reducer;
