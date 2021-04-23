import http from "../http-common";
import authHeader from "./auth-header";

const DOMAIN_URL = '/api/tutorials'

class TutorialService {
  getAll() {
    return http.get(DOMAIN_URL + '/', { headers: authHeader() });
  }

  get(id) {
    return http.get(DOMAIN_URL + '/' + `${id}`, { headers: authHeader() });
  }

  create(data) {
    return http.post(DOMAIN_URL + '/', data, { headers: authHeader() });
  }

  update(id, data) {
    return http.put(DOMAIN_URL + '/' + `${id}`, data, { headers: authHeader() });
  }

  delete(id) {
    return http.delete(DOMAIN_URL + '/' + `${id}`, { headers: authHeader() });
  }

  deleteAll() {
    return http.delete(DOMAIN_URL + '/', { headers: authHeader() });
  }

  findByTitle(title) {
    return http.get(DOMAIN_URL + `?title=${title}`, { headers: authHeader() });
  }
}

export default new TutorialService();
