import org.elasticsearch.client.Client;

public interface ElasticClient {
    
   Client getClient();
  
   void shutDown();
  
    
}
