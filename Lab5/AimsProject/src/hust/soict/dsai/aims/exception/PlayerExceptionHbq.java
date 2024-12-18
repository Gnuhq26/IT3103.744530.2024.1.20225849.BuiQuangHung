package hust.soict.dsai.aims.exception;

public class PlayerExceptionHbq  extends Exception {

    // Constructor mặc định
    public PlayerExceptionHbq() {
        super();  // Gọi constructor của lớp cha (Exception)
    }

    // Constructor nhận một thông điệp lỗi
    public PlayerExceptionHbq(String message) {
        super(message);  // Gọi constructor của lớp cha và truyền thông điệp lỗi vào
    }

    // Constructor nhận thông điệp lỗi và ngoại lệ gốc (Throwable)
    public PlayerExceptionHbq(String message, Throwable cause) {
        super(message, cause);  // Gọi constructor của lớp cha với thông điệp và nguyên nhân
    }

    // Constructor nhận ngoại lệ gốc
    public PlayerExceptionHbq(Throwable cause) {
        super(cause);  // Gọi constructor của lớp cha với ngoại lệ gốc
    }
}
