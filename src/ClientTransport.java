import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

public class ClientTransport implements ElasticClient {

    private static final String localhost = "localhost";

    private static TransportClient client;

    public TransportClient getClient() {

        try {
            Settings settings = Settings.settingsBuilder().put("cluster.name", "my elasticSearchCluster").build();
            client = TransportClient.builder().build()
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(localhost), 9200))
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(localhost), 9201));
        } catch (UnknownHostException ex) {
            Logger.getLogger(ClientTransport.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return client;
      
    }

    @Override
    public void shutDown() {
        client.close();
    }
    
 
}
