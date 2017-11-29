package com.freegiftcards.allgiftcards.makemoney.screens

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.OnClick
import com.freegiftcards.allgiftcards.makemoney.R
import com.yarolegovich.discretescrollview.InfiniteScrollAdapter
import kotlinx.android.synthetic.main.giftcards_activity.*
import kotlinx.android.synthetic.main.scroll_item.view.*
import kotlinx.android.synthetic.main.toolbar.*

class GiftCardsActivity : BaseActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.giftcards_activity)

        bindCoinView()
        bind()

        initScrollers()

        toolbarText.text = "Gift Cards"

        initBanner()
    }

    @OnClick(R.id.addCoinsText)
    fun back(view: View) {
        startActivity(Intent(this, MainActivity::class.java)
                .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP))
        finish()
    }

    private fun initScrollers() {
        xboxScroll.adapter = InfiniteScrollAdapter.wrap(CardsScrollAdapter(arrayOf(R.drawable.xbox_card_25, R.drawable.xbox_card_50, R.drawable.xbox_card_75, R.drawable.xbox_card_100)))
        xboxScroll.setSlideOnFling(true)
        xboxScroll.scrollToPosition(0)

        psnScroll.adapter = InfiniteScrollAdapter.wrap(CardsScrollAdapter(arrayOf(R.drawable.psn_card_25, R.drawable.psn_card_50, R.drawable.psn_card_75, R.drawable.psn_card_100)))
        psnScroll.setSlideOnFling(true)
        psnScroll.scrollToPosition(0)

        amazonScroll.adapter = InfiniteScrollAdapter.wrap(CardsScrollAdapter(arrayOf(R.drawable.amazon_card_25, R.drawable.amazon_card_50, R.drawable.amazon_card_75, R.drawable.amazon_card_100)))
        amazonScroll.setSlideOnFling(true)
        amazonScroll.scrollToPosition(0)

        paypalScroll.adapter = InfiniteScrollAdapter.wrap(CardsScrollAdapter(arrayOf(R.drawable.paypal_card_25, R.drawable.paypal_card_50, R.drawable.paypal_card_75, R.drawable.paypal_card_100)))
        paypalScroll.setSlideOnFling(true)
        paypalScroll.scrollToPosition(0)

        googleScroll.adapter = InfiniteScrollAdapter.wrap(CardsScrollAdapter(arrayOf(R.drawable.google_card_25, R.drawable.google_card_50, R.drawable.google_card_75, R.drawable.google_card_100)))
        googleScroll.setSlideOnFling(true)
        googleScroll.scrollToPosition(0)

        itunesScroll.adapter = InfiniteScrollAdapter.wrap(CardsScrollAdapter(arrayOf(R.drawable.itunes_card_25, R.drawable.itunes_card_50, R.drawable.itunes_card_75, R.drawable.itunes_card_100)))
        itunesScroll.setSlideOnFling(true)
        itunesScroll.scrollToPosition(0)

        steamScroll.adapter = InfiniteScrollAdapter.wrap(CardsScrollAdapter(arrayOf(R.drawable.steam_card_25, R.drawable.steam_card_50, R.drawable.steam_card_75, R.drawable.steam_card_100)))
        steamScroll.setSlideOnFling(true)
        steamScroll.scrollToPosition(0)

        originScroll.adapter = InfiniteScrollAdapter.wrap(CardsScrollAdapter(arrayOf(R.drawable.origin_card_25, R.drawable.origin_card_50, R.drawable.origin_card_75, R.drawable.origin_card_100)))
        originScroll.setSlideOnFling(true)
        originScroll.scrollToPosition(0)
    }

    /*@OnClick(R.id.xbox_25, R.id.xbox_50, R.id.xbox_75, R.id.xbox_100,
            R.id.psn_25, R.id.psn_50, R.id.psn_75, R.id.psn_100,
            R.id.amazon_25, R.id.amazon_50, R.id.amazon_75, R.id.amazon_100,
            R.id.paypal_25, R.id.paypal_50, R.id.paypal_75, R.id.paypal_100,
            R.id.google_25, R.id.google_50, R.id.google_75, R.id.google_100,
            R.id.itunes_25, R.id.itunes_50, R.id.itunes_75, R.id.itunes_100,
            R.id.steam_25, R.id.steam_50, R.id.steam_75, R.id.steam_100,
            R.id.origin_25, R.id.origin_50, R.id.origin_75, R.id.origin_100)
    fun purchaseCard(v: View) {
        when (v.id) {
            R.id.xbox_25 -> {processCard(12000, R.drawable.xbox_card_25)}
            R.id.xbox_50 -> {processCard(20000, R.drawable.xbox_card_50)}
            R.id.xbox_75 -> {processCard(28000, R.drawable.xbox_card_75)}
            R.id.xbox_100 -> {processCard(36000, R.drawable.xbox_card_100)}

            R.id.psn_25 -> {processCard(12000, R.drawable.psn_card_25)}
            R.id.psn_50 -> {processCard(20000, R.drawable.psn_card_50)}
            R.id.psn_75 -> {processCard(28000, R.drawable.psn_card_75)}
            R.id.psn_100 -> {processCard(36000, R.drawable.psn_card_100)}

            R.id.amazon_25 -> {processCard(12000, R.drawable.amazon_card_25)}
            R.id.amazon_50 -> {processCard(20000, R.drawable.amazon_card_50)}
            R.id.amazon_75 -> {processCard(28000, R.drawable.amazon_card_75)}
            R.id.amazon_100 -> {processCard(36000, R.drawable.amazon_card_100)}

            R.id.paypal_25 -> {processCard(12000, R.drawable.paypal_card_25)}
            R.id.paypal_50 -> {processCard(20000, R.drawable.paypal_card_50)}
            R.id.paypal_75 -> {processCard(28000, R.drawable.paypal_card_75)}
            R.id.paypal_100 -> {processCard(36000, R.drawable.paypal_card_100)}

            R.id.google_25 -> {processCard(12000, R.drawable.google_card_25)}
            R.id.google_50 -> {processCard(20000, R.drawable.google_card_50)}
            R.id.google_75 -> {processCard(28000, R.drawable.google_card_75)}
            R.id.google_100 -> {processCard(36000, R.drawable.google_card_100)}

            R.id.itunes_25 -> {processCard(12000, R.drawable.itunes_card_25)}
            R.id.itunes_50 -> {processCard(20000, R.drawable.itunes_card_50)}
            R.id.itunes_75 -> {processCard(28000, R.drawable.itunes_card_75)}
            R.id.itunes_100 -> {processCard(36000, R.drawable.itunes_card_100)}

            R.id.steam_25 -> {processCard(12000, R.drawable.steam_card_25)}
            R.id.steam_50 -> {processCard(20000, R.drawable.steam_card_50)}
            R.id.steam_75 -> {processCard(28000, R.drawable.steam_card_75)}
            R.id.steam_100 -> {processCard(36000, R.drawable.steam_card_100)}

            R.id.origin_25 -> {processCard(12000, R.drawable.origin_card_25)}
            R.id.origin_50 -> {processCard(20000, R.drawable.origin_card_50)}
            R.id.origin_75 -> {processCard(28000, R.drawable.origin_card_75)}
            R.id.origin_100 -> {processCard(36000, R.drawable.origin_card_100)}
        }
    }*/

    inner class CardsScrollAdapter(private val cards: Array<Int>): RecyclerView.Adapter<CardsScrollAdapter.CardsScrollHolder>() {
        override fun getItemCount(): Int {
            return 4
        }

        override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CardsScrollHolder {
            return CardsScrollHolder(LayoutInflater.from(parent?.context).inflate(R.layout.scroll_item, parent, false))
        }

        override fun onBindViewHolder(holder: CardsScrollHolder?, position: Int) {
            holder?.itemView!!.cardImage.setImageDrawable(resources.getDrawable(cards[position]))
            holder.itemView!!.cardImage.setOnClickListener {
                dialogsManager.showRedeemDialog(supportFragmentManager, cards[position],
                        when (position) {
                            0 -> 12000
                            1 -> 20000
                            2 -> 28000
                            3 -> 36000
                            else -> 12000
                        })
            }
        }

        inner class CardsScrollHolder(itemView: View?) : RecyclerView.ViewHolder(itemView)
    }

    override fun onBackPressed() {
        startActivity(Intent(this, MainActivity::class.java)
                .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP))
        finish()
    }

    private fun processCard(price: Int, card: Int) {
        dialogsManager.showRedeemDialog(supportFragmentManager, card, price)
    }
}
