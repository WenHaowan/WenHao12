package as.bwei.com.wenhao1.utils;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by HP on 2018/8/18.
 */

public interface RequestCallback {
    void onResponse(Call call, Response response);

    void failure(Call call, IOException e);
}
