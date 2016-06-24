
import java.net.UnknownHostException;

public class App {
    
     
    public static void main (String args[]) throws UnknownHostException
    {
        ClientTransport client = new ClientTransport();
       // QueryBuilder qb = QueryBuilders.matchQuery("name", "some string");
       // ElasticSearchGet search = new ElasticSearchGet(client);
        Indexer elasticIndexer = new Indexer(client);
        
    }
    
}
