<template>
  <ul class="overflow-y-auto overflow-x-hidden h-[20rem]">
    <li v-for="friend in getFriends">
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


  /**
  *  ���� �������� ���-�� �� �� ANSII (EN), ��  ������������� ����� ������� ��������� UTF-8
  *  ��� ���������� �������������. ������ ������ ������ �� �����.
  */
 import { mapGetters } from 'vuex';
  export default {
    computed: {...mapGetters(['getFriends'])},
  }
</script>
