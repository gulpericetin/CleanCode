package layeredArchitecture.business.abstracts;

import layeredArchitecture.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
