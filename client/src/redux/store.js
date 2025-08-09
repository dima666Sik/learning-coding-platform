import { configureStore } from "@reduxjs/toolkit";
import coursesReducer from "./slices/coursesSlice";
import videosReducer from "./slices/videosSlice";
import userReducer from "./slices/userSlice";

export const store = configureStore({
	reducer: {
		courses: coursesReducer,
		videos: videosReducer,
		user: userReducer,
	},
});
