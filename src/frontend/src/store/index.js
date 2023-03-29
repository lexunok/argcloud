import { createStore } from "vuex";
import profile from "./profile";
import friends from "./friends";
import localchat from "./localchat";
import projects from "./projects";
import files from "./files";

export const store = createStore({
    modules: {
        profile,
        friends,
        localchat,
        projects,
        files
        

    }
})


