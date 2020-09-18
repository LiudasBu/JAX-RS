/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lbucys.treciasdarbas.repository;

import java.util.List;
import lt.viko.eif.lbucys.treciasdarbas.data.Client;

/**
 * An interface for the repository of clients.
 *
 * @author Admin
 */
public interface ClientRepository {

    List<Client> fetchAllClients();

}
