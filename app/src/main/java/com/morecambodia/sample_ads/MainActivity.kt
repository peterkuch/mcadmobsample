package com.morecambodia.sample_ads

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.android.gms.ads.AdView
import com.morecambodia.admobcore.MCAdmob

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var adView = findViewById<AdView>(R.id.adView)
        MCAdmob.getInstances().onInit(this,
                object : MCAdmob() {
                    override fun onAdLoaded() {
                        super.onAdLoaded()
                    }

                    override fun onAdClosed() {
                        super.onAdClosed()
                    }

                    override fun onAdOpened() {
                        super.onAdOpened()
                    }

                    override fun onAdFailedToLoad(p0: Int) {
                        super.onAdFailedToLoad(p0)
                    }

                    override fun onAdClicked() {
                        super.onAdClicked()
                    }

                    override fun onAdImpression() {
                        super.onAdImpression()
                    }
                }, adView, "ca-app-pub-3929444994565715/5dssssss", false)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        MCAdmob.getInstances().showInterstitialAd()
    }
}
