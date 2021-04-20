package Data;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.List;

public class PageDetails {


    private int page;
    @SerializedName
            ("per_page")
    private String perPage;
    private String total;

    @SerializedName
            ("total_pages")
    private String totalPages;

    @SerializedName
            ("data")
    private List<User> users;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getPerPage() {
        return perPage;
    }

    public void setPerPage(String perPage) {
        this.perPage = perPage;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(String totalPages) {
        this.totalPages = totalPages;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void printAllUsersMail() {
        for (User user : users) {
            System.out.println(user.getEmail());
        }
    }

    public static PageDetails getSpecificPage(int pageNumber) {
        String result = "";
        OkHttpClient client = new OkHttpClient();

        String url = "https://reqres.in/api/users?page=" + pageNumber;
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            result = response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }


        Gson gson = new Gson();
        PageDetails details = gson.fromJson(result, PageDetails.class);
        return details;
    }

}
