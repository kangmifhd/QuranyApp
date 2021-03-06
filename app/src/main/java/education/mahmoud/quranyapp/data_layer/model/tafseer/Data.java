
package education.mahmoud.quranyapp.data_layer.model.tafseer;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("surahs")
    @Expose
    private List<Surah> surahs = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param surahs
     */
    public Data(List<Surah> surahs) {
        super();
        this.surahs = surahs;
    }

    public List<Surah> getSurahs() {
        return surahs;
    }

    public void setSurahs(List<Surah> surahs) {
        this.surahs = surahs;
    }

}
