*,
html,
body {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: Cambria, Cochin, Georgia, Times, "Times New Roman", serif;
  scroll-behavior: smooth;
}

ul {
  display: flex;
  gap: 10px;
  background-color: #222222;
  justify-content: center;
  align-items: center;
}

li {
  display: flex;
  padding: 12px;
  list-style-type: none;
}

li > a {
  color: gray;
  text-decoration: none;
}

li > a:hover {
  color: white;
  transition: all 0.5s ease-in-out;
}

.container {
  width: 300px;
  margin: 0 auto;
}

.wrapper {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  min-height: 100vh;
  max-width: 400px;
}

.content {
  margin: 8px;
}

.row {
  display: flex;
  justify-content: center;
  flex-direction: row;
}

button {
  border: none;
  background-color: lightseagreen;
  font-size: 24px;
  padding: 16px;
  margin-left: 10px;
  height: 65px;
  color: #eaeaea;
  font-weight: 600;
  margin-top: 10px;
}

button:hover {
  cursor: pointer;
  background-color: #333333;
  transition: 0.5s all ease-in-out;
}

input {
  border: none;
  background-color: #eaeaea;
  color: #222222;
  padding: 16px;
  font-size: 24px;
  margin-top: 10px;
  max-width: 300px;
}

#pertanyaan {
  font-size: 1.6em;
  font-weight: 500;
}

#loaders {
  display: none;
  width: 85px;
  height: 85px;
  position: absolute;
  border-top: 15px solid lightseagreen;
  border-radius: 50%;
  top: 50%;
  left: 50%;
  z-index: 9;
  animation: 1s spin infinite linear;
}

@keyframes spin {
  0% {
    transform: rotate(0deg);
  }

  100% {
    transform: rotate(360deg);
  }
}

.aboutContainer {
  width: 100%;
  min-height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: lightseagreen;
}

.aboutWrapper {
  display: flex;
  gap: 40px;
}