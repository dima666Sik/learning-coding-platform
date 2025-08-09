import { createSlice } from "@reduxjs/toolkit";

const initialState = {
	videos: {
		1: [
			{
				id: "v1",
				title: "Java Intro",
				url: "https://www.youtube.com/embed/GoXwIVyNvX0",
				comments: [],
			},
			{
				id: "v2",
				title: "Java OOP",
				url: "https://www.youtube.com/embed/QoCnCQCSj_Q",
				comments: [],
			},
		],
		2: [
			{
				id: "v3",
				title: "React Setup",
				url: "https://www.youtube.com/embed/qe3mrBmeno8",
				comments: [],
			},
			{
				id: "v4",
				title: "React Hooks",
				url: "https://www.youtube.com/embed/xfKYYRE6-TQ&ab_channel=PedroTech",
				comments: [],
			},
		],
	},
};

const videosSlice = createSlice({
	name: "videos",
	initialState,
	reducers: {
		addComment: (state, action) => {
			const { courseId, videoId, comment } = action.payload;
			const video = state.videos[courseId].find((v) => v.id === videoId);
			if (video) {
				video.comments.push(comment);
			}
		},
	},
});

export const { addComment } = videosSlice.actions;
export default videosSlice.reducer;
