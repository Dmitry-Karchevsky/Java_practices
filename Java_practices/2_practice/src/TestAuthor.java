public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Стивен Кинг", "stiv_king@mail.com", 'M');
        System.out.println(a1);
        a1.setEmail("stivenkg@mail.com");
        System.out.println(a1);
        System.out.println(a1.getEmail());
    }
}
