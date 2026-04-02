package re.ss4_k2.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ApiResponse<T> {
    private boolean success;
    private String message;
    private T data;


    public static <T> ApiResponse<T> ok(String msg, T data) {
        return new ApiResponse<>(true, msg, data);
    }

    public static <T> ApiResponse<T> error(String msg) {
        return new ApiResponse<>(false, msg, null);

    }
}