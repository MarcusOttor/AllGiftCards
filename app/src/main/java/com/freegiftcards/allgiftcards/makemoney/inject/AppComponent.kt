package com.freegiftcards.allgiftcards.makemoney.inject

import com.freegiftcards.allgiftcards.makemoney.core.MyApplication
import com.freegiftcards.allgiftcards.makemoney.core.services.ClaimService
import com.freegiftcards.allgiftcards.makemoney.screens.dialogs.LoginDialog
import com.freegiftcards.allgiftcards.makemoney.screens.dialogs.PromocodeDialog
import com.freegiftcards.allgiftcards.makemoney.screens.dialogs.RedeemDialog
import com.freegiftcards.allgiftcards.makemoney.screens.dialogs.SignupDialog
import com.freegiftcards.allgiftcards.makemoney.screens.BaseActivity
import dagger.Component

@Component(modules = arrayOf(AppModule::class, MainModule::class))
interface AppComponent {

    fun inject(screen: BaseActivity)
    fun inject(app: MyApplication)
    fun inject(dialog: LoginDialog)
    fun inject(dialog: SignupDialog)
    fun inject(dialog: PromocodeDialog)
    fun inject(dialog: RedeemDialog)
    fun inject(service: ClaimService)
}
