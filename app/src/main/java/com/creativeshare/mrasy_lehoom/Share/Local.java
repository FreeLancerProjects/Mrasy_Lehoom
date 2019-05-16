package com.creativeshare.mrasy_lehoom.Share;


import android.app.Application;
import android.content.Context;

import com.creativeshare.mrasy_lehoom.Language.Language;

public class Local extends Application {
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(Language.updateResources(newBase, Language.getLanguage(newBase)));

    }

}

