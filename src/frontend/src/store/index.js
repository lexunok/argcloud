import { createStore } from "vuex";
import profile from "./profile";
import friends from "./friends";
import localchat from "./localchat";
import projects from "./projects";
import files from "./files";
import projectView from "./util/project.js"
import inProjectView from "./util/inProject.js"
import profileView from "./util/profile.js"
import fileView from "./util/file.js"
import chatView from "./util/chat.js"

export const store = createStore({
    modules: {
        profile,
        friends,
        localchat,
        projects,
        files,
        projectView,
        inProjectView,
        profileView,
        fileView,
        chatView
        

    }
})


