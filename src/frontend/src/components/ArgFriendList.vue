<template>
  <ul class="overflow-y-auto overflow-x-hidden h-[20rem]">
    <li v-for="friend in friends">
      <div class="flex flex-row h-auto mt-1">
        <div class="my-auto">
          <img class="rounded-full container w-10 h-10" src="../assets/nonimg.jpg" />
        </div>
        <div class="ml-4 my-auto w-full overflow-hidden">
          <div>{{friend.fullname}}</div>
          <div>@{{ friend.username }}</div>
        </div>
      </div>
    </li>
  </ul>
</template>
<script>
  import axios from 'axios'

  /**
  *  ���� �������� ���-�� �� �� ANSII (EN), ��  ������������� ����� ������� ��������� UTF-8
  *  ��� ���������� �������������. ������ ������ ������ �� �����.
  */
  export default {
    data() {

      return {
        usersearch: null,
        friends: null,
        addFriend: null
      }

    },
    async created() {
      const response = await axios.get("/api/friends", { params: { username: localStorage.getItem("username") } })
      this.friends = response.data
    },
    methods: {
      async searchUser() {
        if (this.usersearch != localStorage.getItem("username")) {
          const response = await axios.get("/api/profile", { params: { username: this.usersearch } })
          this.addFriend = response.data
        }
        this.clearText()
      },
      clearText() {
        this.usersearch = ''
      },
      async addUser() {
        await axios.post("/api/friends", { user: localStorage.getItem("username"), friend: this.addFriend.username })
      },
      async deleteUser(name) {
        await axios.delete("/api/friends", { data: { user: localStorage.getItem("username"), friend: name } })
      }
    }
  }
</script>
