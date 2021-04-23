import SignService from "./sign.service";

class AuthService {
  login(user) {
    return SignService
      .signin({
        username: user.username,
        password: user.password
      })
      .then(response => {
        if (response.data.token) {
          localStorage.setItem('user', JSON.stringify(response.data));
        }

        return response.data;
      });
  }

  logout() {
    localStorage.removeItem('user');
  }

  register(user) {
    return SignService.register({
      username: user.username,
      email: user.email,
      password: user.password
    });
  }
}

export default new AuthService();
