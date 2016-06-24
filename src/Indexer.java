import java.util.HashMap;
import java.util.Map;
import org.elasticsearch.action.index.IndexResponse;

public class Indexer {

    private static ClientTransport client;
    private static IndexResponse response;

    public Indexer(ClientTransport client) {

        this.client = client;
    }

    public static IndexResponse createIndexResponse(String indexName, String type, Map jsonData) {

        response = client.getClient().prepareIndex(indexName, type)
                .setSource(jsonData)
                .execute()
                .actionGet();
        return response;
    }

    public void createDocuments() {
        Map<String, Object> jsonData = new HashMap<String, Object>();
        jsonData.put("title", "Paranoid");
        jsonData.put("lyrics", "la la la la ");
        jsonData.put("age", "1995");
        jsonData.put("artist", "Garbage");
        IndexResponse response = createIndexResponse("music", "lyrics", jsonData);
        // System.out.println(response.getId() + "--" + response.getIndex() + "--" + response.getType() + "--" + response.getVersion() + "--" + response.isCreated());

    }

}
