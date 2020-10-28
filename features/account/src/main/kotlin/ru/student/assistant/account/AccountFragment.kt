package ru.student.assistant.account

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.account.*
import ru.student.assistant.calls.R

class AccountFragment : Fragment() {

    private var title: String = ""
    private var subTitle: String = ""

    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, state: Bundle?): View? =
        inflater.inflate(R.layout.account, group, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

   //     val model = ViewModelProvider(activity)[AuthViewModel::class.java]

      /*  model.observeUser(activity, Observer {
            title = it.name.trim()
            subTitle = "${it.faculty.trim()} | ${it.group.trim()}"
        })*/

        uName.text = title
        uGroup.text = subTitle

   //     exit.setOnClickListener { model.signOut() }
    }


}