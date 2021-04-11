

package com.newsorg.newsapp.android.data.local.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import com.newsorg.newsapp.android.data.DataManager;
import com.newsorg.newsapp.android.di.PreferenceInfo;
import com.newsorg.newsapp.android.utils.AppConstants;
import javax.inject.Inject;

/**
 * Created by satyajit on 09/04/21.
 */

public class AppPreferencesHelper implements PreferencesHelper {

    private static final String PREF_KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN";

    private final SharedPreferences mPrefs;

    @Inject
    public AppPreferencesHelper(Context context, @PreferenceInfo String prefFileName) {
        mPrefs = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE);
    }

    @Override
    public String getAccessToken() {
        return mPrefs.getString(PREF_KEY_ACCESS_TOKEN, null);
    }

    @Override
    public void setAccessToken(String accessToken) {
        mPrefs.edit().putString(PREF_KEY_ACCESS_TOKEN, accessToken).apply();
    }

}
