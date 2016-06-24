import org.elasticsearch.client.Client;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.node.Node;
import org.elasticsearch.node.NodeBuilder;

public class ClientNode implements ElasticClient {

    private Node elasticNode;
    private static Client client;

    public ClientNode() {

        client = NodeBuilder.nodeBuilder().client(true).node().client();
        Settings settings = Settings.settingsBuilder().put("cluster.name", "my elasticSearchCluster").build();
        
    }

    @Override
    public Client getClient() {
        return client;
    }

    @Override
    public void shutDown() {
        client.close();
    }

}
