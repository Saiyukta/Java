package Generics;
//Generic Interfaces

public class Exercise5 {

    interface Repository<T> {

        void save(T object);

        T findById(int id);
    }

    public static void main(String[] args) {
        Repository<String> repository = new Repository<String>() {
            @Override
            public void save(String object) {
                System.out.println(object);
            }

            @Override
            public String findById(int id) {
                return "";
            }
        };

        repository.save(new String("Coke"));
        repository.save(new String("Pepsi"));
        repository.save(new String("ThumbsUp"));

    }
}
