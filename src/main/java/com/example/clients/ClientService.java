package com.example.clients;

import com.sun.tools.javac.util.ArrayUtils;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by senthil on 2/2/17.
 */
@RestController
public class ClientService {

    private List<Client> clients = new ArrayList<Client>();

    public ClientService() {
        Client client = new Client("12865113");
        clients.add(client);
    }

    @RequestMapping (value= {"/clients", "/clients/{clientId}"})
    public List<Client> getClients(@PathVariable Optional<String> clientId) {
        List<Client> clientList = null;
        if(clientId.isPresent()){
            clientList = new ArrayList<Client>();
            clientList.add(getClient(new Client(clientId.get())));
            return clientList;
        }
        return clients;
    }

    private Client getClient(Client client) {
        int location = Collections.binarySearch(clients, client, new Comparator<Client>() {
            public int compare(Client c1, Client c2) {
                return c1.getClientId().compareTo(c2.getClientId());
            }
        });

        if(location != -1) {
            return clients.get(location);
        }
        else
            return null;
    }
}
