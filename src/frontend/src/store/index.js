import { createStore } from "vuex";
import TeamChat from "./teamchat";
import profile from "./profile";
import friends from "./friends";
import localchat from "./localchat";

export const store = createStore({
    modules: {
        TeamChat,
        profile,
        friends,
        localchat
        

    }
})


