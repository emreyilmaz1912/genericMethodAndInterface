public class Student <T> implements IDatabase <T> {
    @Override
    public boolean insert(T data) {
        System.out.println("Veri eklendi.");
        return false;
    }

    @Override
    public boolean delete(T data) {
        System.out.println("Veri silindi.");
        return false;
    }

    @Override
    public boolean update(T data) {
        System.out.println("Veri güncellendi.");
        return true;
    }

    @Override
    public String select() {
        System.out.println("Veri çekildi.");
        return null;
    }
}

