
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.node.NodeBuilder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annatsolakou
 */
public class App {
    
      private static final String INDEX = "http://localhost:9200/music/lyrics/_search?q=lyrics:'you";
      private static final String localhost = "localhost";
    
    public static void main (String args[]) throws UnknownHostException
    {
        
        Client client = new TransportClient()
                        .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(localhost), 9300))
                        .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(localhost), 9301));
        
        client.close();
        
    }
    
}
