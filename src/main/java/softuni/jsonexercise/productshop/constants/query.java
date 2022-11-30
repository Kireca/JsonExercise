package softuni.jsonexercise.productshop.constants;

public enum query {
    ;


    public static final String FIND_ALL_BY_PRICE_BETWEEN = "SELECT new softuni.jsonexercise.productshop.entities.products.ProductWithoutBuyerDTO(" +
            "p.name, p.price , p.seller.firstName, p.seller.lastName)" +
            " FROM Product as p" +
            " WHERE p.price > :rangeStart AND p.price < :rangeEnd AND p.buyer IS NULL" +
            " ORDER BY p.price asc";


    public static final String FIND_ALL_WITH_SOLD_PRODUCTS = "SELECT u FROM User u" +
            " JOIN u.sellingProducts p" +
            " WHERE p.buyer IS NOT NULL";


    public static final String GET_CATEGORY_STATS = "SELECT new softuni.jsonexercise.productshop.entities.categories.CategoryStats(" +
            "c.name, COUNT(p), AVG(p.price), SUM(p.price))" +
            " FROM Product p" +
            " JOIN p.categories c" +
            " GROUP BY c";
}
