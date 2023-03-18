<template>
  <div id="navigation">
    <nav class="flex flex-col text-white bg-violet-700 w-48 h-full" id="anim">
      <div class="mt-10 h-14">
        <button type="button" class="transition duration-150 ease-in-out
                h-full w-full
            bg-violet-700 hover:bg-violet-800 active:bg-violet-900" @click="$router.push('/profile')">
          <div class="ml-3">{{ fullname }}</div>
          <div class="ml-3">{{ username }}</div>
        </button>
      </div>
      <div class="mt-6 h-14" id="nav-button-side">
        <button type="button" class="transition duration-150 ease-in-out
                h-full w-full
            bg-violet-700 hover:bg-violet-800 active:bg-violet-900" @click="$router.push('/news')">
          <div class="font-bold">Новости</div>
        </button>
      </div>
      <div class="mt-6 h-14" id="nav-button-side">
        <button type="button" class="transition duration-150 ease-in-out
                h-full w-full
            bg-violet-700 hover:bg-violet-800 active:bg-violet-900" @click="$router.push('/team')">
          <div class="font-bold">Команда</div>
        </button>
      </div>
      <div class="mt-6 h-14" id="nav-button-side">
        <button type="button" class="transition duration-150 ease-in-out
                h-full w-full
            bg-violet-700 hover:bg-violet-800 active:bg-violet-900" @click="$router.push('/chat')">
          <div class="font-bold">Чат</div>
        </button>
      </div>
      <div class="mt-6 h-14" id="nav-button-side">
        <button type="button" class="transition duration-150 ease-in-out
                h-full w-full
            bg-violet-700 hover:bg-violet-800 active:bg-violet-900" @click="$router.push('/files')">
          <div class="font-bold">Хранилище</div>
        </button>
      </div>
      <div class="mt-6 h-14" id="nav-button-side">
        <button type="button" class="transition duration-150 ease-in-out
                h-full w-full
            bg-violet-700 hover:bg-violet-800 active:bg-violet-900" @click="$router.push('/tools')">
          <div class="font-bold ">Инструменты</div>
        </button>
      </div>
    </nav>
    <nav class="flex flex-col bg-violet-700 w-20 h-full fixed top-0 left-0" id="main-nav">
      <div class="">
        <img class="rounded-full container ml-3 w-14 h-14 mt-10" src="../assets/nonimg.jpg" />
      </div>
      <div class="h-14 mt-6" id="nav-button-main">
        <div class="h-14 w-14 mx-auto">
          <button type="button" class="transition duration-150 ease-in-out
                h-full w-full rounded-full bg-cyan-500 bg-cyan-500" @click="$router.push('/news')">
            <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="#6D28D9" class="w-12 h-12 mx-auto">
              <path fill-rule="evenodd" d="M4.125 3C3.089 3 2.25 3.84 2.25 4.875V18a3 3 0 003 3h15a3 3 0 01-3-3V4.875C17.25 3.839 16.41 3 15.375 3H4.125zM12 9.75a.75.75 0 000 1.5h1.5a.75.75 0 000-1.5H12zm-.75-2.25a.75.75 0 01.75-.75h1.5a.75.75 0 010 1.5H12a.75.75 0 01-.75-.75zM6 12.75a.75.75 0 000 1.5h7.5a.75.75 0 000-1.5H6zm-.75 3.75a.75.75 0 01.75-.75h7.5a.75.75 0 010 1.5H6a.75.75 0 01-.75-.75zM6 6.75a.75.75 0 00-.75.75v3c0 .414.336.75.75.75h3a.75.75 0 00.75-.75v-3A.75.75 0 009 6.75H6z" clip-rule="evenodd" />
              <path d="M18.75 6.75h1.875c.621 0 1.125.504 1.125 1.125V18a1.5 1.5 0 01-3 0V6.75z" />
            </svg>
          </button>
        </div>
      </div>
      <div class="h-14 mt-6" id="nav-button-main">
        <div class="h-14 w-14 mx-auto">
          <button type="button" class="transition duration-150 ease-in-out
                h-full w-full rounded-full bg-cyan-500 bg-cyan-500" @click="$router.push('/team')">
            <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="#6D28D9" class="w-12 h-12 mx-auto">
              <path fill-rule="evenodd" d="M7.5 5.25a3 3 0 013-3h3a3 3 0 013 3v.205c.933.085 1.857.197 2.774.334 1.454.218 2.476 1.483 2.476 2.917v3.033c0 1.211-.734 2.352-1.936 2.752A24.726 24.726 0 0112 15.75c-2.73 0-5.357-.442-7.814-1.259-1.202-.4-1.936-1.541-1.936-2.752V8.706c0-1.434 1.022-2.7 2.476-2.917A48.814 48.814 0 017.5 5.455V5.25zm7.5 0v.09a49.488 49.488 0 00-6 0v-.09a1.5 1.5 0 011.5-1.5h3a1.5 1.5 0 011.5 1.5zm-3 8.25a.75.75 0 100-1.5.75.75 0 000 1.5z" clip-rule="evenodd" />
              <path d="M3 18.4v-2.796a4.3 4.3 0 00.713.31A26.226 26.226 0 0012 17.25c2.892 0 5.68-.468 8.287-1.335.252-.084.49-.189.713-.311V18.4c0 1.452-1.047 2.728-2.523 2.923-2.12.282-4.282.427-6.477.427a49.19 49.19 0 01-6.477-.427C4.047 21.128 3 19.852 3 18.4z" />
            </svg>
          </button>
        </div>
      </div>
      <div class="h-14 mt-6" id="nav-button-main">
        <div class="h-14 w-14 mx-auto">
          <button type="button" class="transition duration-150 ease-in-out
                h-full w-full rounded-full bg-cyan-500 bg-cyan-500" @click="$router.push('/chat')">
            <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="#6D28D9" class="w-12 h-12 mx-auto">
              <path d="M4.913 2.658c2.075-.27 4.19-.408 6.337-.408 2.147 0 4.262.139 6.337.408 1.922.25 3.291 1.861 3.405 3.727a4.403 4.403 0 00-1.032-.211 50.89 50.89 0 00-8.42 0c-2.358.196-4.04 2.19-4.04 4.434v4.286a4.47 4.47 0 002.433 3.984L7.28 21.53A.75.75 0 016 21v-4.03a48.527 48.527 0 01-1.087-.128C2.905 16.58 1.5 14.833 1.5 12.862V6.638c0-1.97 1.405-3.718 3.413-3.979z" />
              <path d="M15.75 7.5c-1.376 0-2.739.057-4.086.169C10.124 7.797 9 9.103 9 10.609v4.285c0 1.507 1.128 2.814 2.67 2.94 1.243.102 2.5.157 3.768.165l2.782 2.781a.75.75 0 001.28-.53v-2.39l.33-.026c1.542-.125 2.67-1.433 2.67-2.94v-4.286c0-1.505-1.125-2.811-2.664-2.94A49.392 49.392 0 0015.75 7.5z" />
            </svg>
          </button>
        </div>
      </div>
      <div class="h-14 mt-6" id="nav-button-main">
        <div class="h-14 w-14 mx-auto">
          <button type="button" class="transition duration-150 ease-in-out
                h-full w-full rounded-full bg-cyan-500 bg-cyan-500" @click="$router.push('/files')">
            <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="#6D28D9" class="w-12 h-12 mx-auto">
              <path fill-rule="evenodd" d="M10.5 3.75a6 6 0 00-5.98 6.496A5.25 5.25 0 006.75 20.25H18a4.5 4.5 0 002.206-8.423 3.75 3.75 0 00-4.133-4.303A6.001 6.001 0 0010.5 3.75zm2.03 5.47a.75.75 0 00-1.06 0l-3 3a.75.75 0 101.06 1.06l1.72-1.72v4.94a.75.75 0 001.5 0v-4.94l1.72 1.72a.75.75 0 101.06-1.06l-3-3z" clip-rule="evenodd" />
            </svg>
          </button>
        </div>
      </div>
      <div class="h-14 mt-6" id="nav-button-main">
        <div class="h-14 w-14 mx-auto">
          <button type="button" class="transition duration-150 ease-in-out
                h-full w-full rounded-full bg-cyan-500 bg-cyan-500" @click="$router.push('/tools')">
            <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="#6D28D9" class="w-12 h-12 mx-auto">
              <path fill-rule="evenodd" d="M11.078 2.25c-.917 0-1.699.663-1.85 1.567L9.05 4.889c-.02.12-.115.26-.297.348a7.493 7.493 0 00-.986.57c-.166.115-.334.126-.45.083L6.3 5.508a1.875 1.875 0 00-2.282.819l-.922 1.597a1.875 1.875 0 00.432 2.385l.84.692c.095.078.17.229.154.43a7.598 7.598 0 000 1.139c.015.2-.059.352-.153.43l-.841.692a1.875 1.875 0 00-.432 2.385l.922 1.597a1.875 1.875 0 002.282.818l1.019-.382c.115-.043.283-.031.45.082.312.214.641.405.985.57.182.088.277.228.297.35l.178 1.071c.151.904.933 1.567 1.85 1.567h1.844c.916 0 1.699-.663 1.85-1.567l.178-1.072c.02-.12.114-.26.297-.349.344-.165.673-.356.985-.57.167-.114.335-.125.45-.082l1.02.382a1.875 1.875 0 002.28-.819l.923-1.597a1.875 1.875 0 00-.432-2.385l-.84-.692c-.095-.078-.17-.229-.154-.43a7.614 7.614 0 000-1.139c-.016-.2.059-.352.153-.43l.84-.692c.708-.582.891-1.59.433-2.385l-.922-1.597a1.875 1.875 0 00-2.282-.818l-1.02.382c-.114.043-.282.031-.449-.083a7.49 7.49 0 00-.985-.57c-.183-.087-.277-.227-.297-.348l-.179-1.072a1.875 1.875 0 00-1.85-1.567h-1.843zM12 15.75a3.75 3.75 0 100-7.5 3.75 3.75 0 000 7.5z" clip-rule="evenodd" />
            </svg>
          </button>
        </div>
      </div>
      <div class="h-14 mt-24" id="nav-button-main">
        <div class="h-12 w-12 mt-1 mx-auto">
          <button type="button" class="transition duration-150 ease-in-out " @click="$router.push('/')">
            <img class="" src="../assets/exit.png" />
          </button>
        </div>
      </div>
    </nav>
  </div>
</template>

<script>
  /**
  *  ���� �������� ���-�� �� �� ANSII (EN), ��  ������������� ����� ������� ��������� UTF-8
  *  ��� ���������� �������������. ������ ������ ������ �� �����.
  */
  export default {
    data() {
      return {
        fullname: "",
        username: ""
      }
    },
    created() {
      this.fullname = localStorage.getItem("fullname")
      this.username = "@" + localStorage.getItem("username")
    }
  }
</script>
<style>
  #anim {
    position: fixed;
    top: 0;
    left: -115px;
    transition: left .2s linear;
  }

  #navigation:hover #anim {
    left: 80px;
  }
</style>
