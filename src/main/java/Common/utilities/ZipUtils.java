package Common.utilities;

import org.zeroturnaround.zip.ZipUtil;

import java.io.File;
import java.net.URI;


import static Common.constants.FrameworkConstants.*;

public class ZipUtils {

    public static void zip() {
        if (ZIP_FOLDER.toLowerCase().trim().equals(YES)) {
            if ((ZIP_FOLDER_PATH != null || !ZIP_FOLDER_PATH.isEmpty()) && (ZIP_FOLDER_NAME != null || !ZIP_FOLDER_NAME.isEmpty())) {
                ZipUtil.pack(new File(ZIP_FOLDER_PATH), new File(ZIP_FOLDER_NAME));
                Log.info("Zipped " + ZIPPED_EXTENT_REPORTS_FOLDER + " successfully !!");
            } else {
                ZipUtil.pack(new File(EXTENT_REPORT_FOLDER_PATH), new File(ZIPPED_EXTENT_REPORTS_FOLDER));
                Log.info("Zipped " + ZIPPED_EXTENT_REPORTS_FOLDER + " successfully !!");
            }
        }
    }

}