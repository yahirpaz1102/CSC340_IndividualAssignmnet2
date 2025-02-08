package ApiApplication.demo;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class TransportationService {
    private final Map<Integer, TransportInformation> transportDatabase = new HashMap<>();
    private int currentId = 1;

    public Object getAllTransportInfo() {
        return transportDatabase.values();
    }

    public TransportInformation getTransportById(int id) {
        return transportDatabase.get(id);
    }

    public Object createTransport(TransportInformation transportInfo) {
        transportInfo.setId(currentId);
        transportDatabase.put(currentId, transportInfo);
        currentId++;
        return transportDatabase.values();
    }

    public Object deleteTransport(int id) {
        transportDatabase.remove(id);
        return transportDatabase.values();
    }
}
