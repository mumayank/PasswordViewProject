package com.mumayank.passwordview

import android.app.Activity
import android.text.method.PasswordTransformationMethod
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class PasswordView {

    companion object {

        private const val SHOW = "SHOW"
        private const val HIDE = "HIDE"

        fun initAndGetPasswordET(activity: Activity, baseLayout: LinearLayout): EditText {
            val passwordView = activity.layoutInflater.inflate(R.layout.password_view_layout, null)
            baseLayout.addView(passwordView)

            val passwordET = baseLayout.findViewById<EditText>(R.id.passwordET)
            val showHideTV = baseLayout.findViewById<TextView>(R.id.showHideTV)
            showHideTV.setOnClickListener {
                if (showHideTV.text.toString() == SHOW) {
                    showHideTV.text = HIDE
                    passwordET.transformationMethod = null
                } else {
                    showHideTV.text = SHOW
                    passwordET.transformationMethod = PasswordTransformationMethod()

                }
            }

            return passwordET
        }

        fun initAndGetEmailET(activity: Activity, baseLayout: LinearLayout): EditText {
            val passwordView = activity.layoutInflater.inflate(R.layout.email_view_layout, null)
            baseLayout.addView(passwordView)

            val emailET = baseLayout.findViewById<EditText>(R.id.emailET)
            val clearTV = baseLayout.findViewById<TextView>(R.id.clearTV)
            clearTV.setOnClickListener {
                emailET.setText("")
                emailET.requestFocus()
            }

            return emailET
        }

    }

}