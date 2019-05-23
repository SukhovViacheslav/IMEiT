package ru.vyaacheslav.suhov.imeit.view.ftagments.calls

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.vyaacheslav.suhov.imeit.MainActivity
import ru.vyaacheslav.suhov.imeit.R
import ru.vyaacheslav.suhov.imeit.view.adapters.CallListFragmentAdapter
import ru.vyaacheslav.suhov.imeit.viewmodel.CallTimeViewModel

/** В данном фрагменте мы можем только посмотреть как изменется лист со звонками */
class CallPreviewFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        val v = inflater.inflate(R.layout.fr_recycler, container, false)
        val model = ViewModelProviders.of(context as MainActivity)[CallTimeViewModel::class.java]

        val adapter = CallListFragmentAdapter()
        val recycler: RecyclerView = v.findViewById(R.id.recycler)
        val decoration = DividerItemDecoration(recycler.context, LinearLayoutManager(context).orientation)

        recycler.layoutManager = LinearLayoutManager(context)
        recycler.adapter = adapter
        recycler.itemAnimator = DefaultItemAnimator()
        recycler.addItemDecoration(decoration)

      //  model.observePreviewList(this, Observer { adapter.addAllAndNotify(it) })
        return v
    }
}