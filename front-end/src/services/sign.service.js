import http from "../http-common";

const API_URL = "/api/auth/";

class SignService {
  signin(data) {
    return http.post(API_URL + 'signin', data);
  }

  register(data) {
    return http.post(API_URL + 'signup', data);
  }
}

export default new SignService();
