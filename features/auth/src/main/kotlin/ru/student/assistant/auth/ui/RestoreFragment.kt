package ru.student.assistant.auth.ui

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.appbar.AppBarLayout
import kotlinx.android.synthetic.main.fr_restore.*
import ru.student.assistant.auth.R
import ru.student.assistant.auth.util.isValidEmail
import ru.student.assistant.auth.viewmodel.AuthRestoreViewModel
import ru.student.assistant.auth.viewmodel.AuthState
import ru.student.assistant.auth.viewmodel.AuthViewModel

class RestoreFragment : Fragment() {

    val state: AuthState = AuthState.RESTORE

    private lateinit var authModel: AuthViewModel
    private lateinit var viewModel: AuthRestoreViewModel

    private var isValid = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        authModel = ViewModelProvider(activity!!)[AuthViewModel::class.java]
        authModel.setState(state)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        viewModel = ViewModelProvider(this)[AuthRestoreViewModel::class.java]
        return inflater.inflate(R.layout.fr_restore, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        isValid = edRestore.isValidEmail()
        viewModel.setValidForm(isValid)

        viewModel.observeForm(this, Observer {
            authModel.setEnableAction(edRestore.isValidEmail())
        })

        back.setOnClickListener {

            val frame: AppBarLayout = activity!!.findViewById(R.id.authAppBarLayout)

            frame.visibility = View.VISIBLE
            authModel.setActionName(resources.getString(R.string.sign_in))

            activity!!.supportFragmentManager.beginTransaction().remove(this).commit()

            authModel.setState(AuthState.SIGN_IN)
        }

        edRestore.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (!android.util.Patterns.EMAIL_ADDRESS.matcher(edRestore.text.toString())
                        .matches()
                ) {
                    edRestore.error = resources.getString(R.string.incorrect_email)
                }

                isValid = edRestore.isValidEmail()
                viewModel.setValidForm(isValid)
                authModel.setEnableAction(isValid && (authModel.getState() == AuthState.RESTORE))

            }
        })
    }

    override fun onResume() {
        super.onResume()
        viewModel.setValidForm(isValid)
    }


}