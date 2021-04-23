import http from "../http-common";
import authHeader from "./auth-header";

const DOMAIN_URL = '/api/test/';

class UserService {
  getPublicContent() {
    return http.get(DOMAIN_URL + 'all');
  }

  getUserBoard() {
    return http.get(DOMAIN_URL + 'user', { headers: authHeader() });
  }

  getModeratorBoard() {
    return http.get(DOMAIN_URL + 'mod', { headers: authHeader() });
  }

  getAdminBoard() {
    return http.get(DOMAIN_URL + 'admin', { headers: authHeader() });
  }
}

export default new UserService();
