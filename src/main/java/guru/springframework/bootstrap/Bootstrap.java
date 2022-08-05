package guru.springframework.bootstrap;

import guru.springframework.domain.Vendor;
import guru.springframework.repositories.VendorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private final VendorRepository vendorRepository;

    public Bootstrap(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        //given
        Vendor vendor1 = new Vendor();
        vendor1.setId(1l);
        vendor1.setName("OOO cool Ltd");
        vendorRepository.save(vendor1);

        Vendor vendor2 = new Vendor();
        vendor2.setId(2l);
        vendor2.setName("OOO EU Corp");
        vendorRepository.save(vendor2);

        System.out.println("Customers Loaded: " + vendorRepository.count());
    }
}
