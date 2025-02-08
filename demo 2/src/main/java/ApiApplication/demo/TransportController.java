package ApiApplication.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transport")
public class TransportController {
    private final TransportationService transportationService;

    public TransportController(TransportationService transportationService) {
        this.transportationService = transportationService;
    }

    @GetMapping("/all")
    public Object getAllTransportInfo() {
        return transportationService.getAllTransportInfo();
    }

    @GetMapping("/{id}")
    public TransportInformation getTransportById(@PathVariable int id) {
        return transportationService.getTransportById(id);
    }

    @PostMapping("/create")
    public Object createTransport(@RequestBody TransportInformation transportInfo) {
        return transportationService.createTransport(transportInfo);
    }

    @DeleteMapping("/delete/{id}")
    public Object deleteTransport(@PathVariable int id) {
        return transportationService.deleteTransport(id);
    }
}
