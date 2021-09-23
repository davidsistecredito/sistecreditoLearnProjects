package com.sistecredito.cocktails.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.load.engine.Resource
import com.sistecredito.cocktails.R
import com.sistecredito.cocktails.data.model.DataSource
import com.sistecredito.cocktails.domain.apiImplement
import com.sistecredito.cocktails.ui.viewmodel.MainViewModel
import com.sistecredito.cocktails.ui.viewmodel.VMFactory
import kotlinx.android.synthetic.main.fragment_main.*


class Main : Fragment() {

    private val viewModel by viewModels<MainViewModel>{ VMFactory(apiImplement(DataSource())) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        viewModel.fetchCocktailList.observe(viewLifecycleOwner, Observer { result ->
            when(result){
                is Resource.Loading -> {
                    progressBar.visibility = View.VISIBLE
                }
                is Resource.Success -> {
                    progressBar.visibility = View.GONE
                    rv_cocteles.adapter = MainRecyclerAdapter(requireContext(),result.data)
                }
                is Resource.Failure -> {
                    progressBar.visibility = View.GONE
                    Toast.makeText(requireContext(), "He tenido un problema para traer los datos ${result.exception}", Toast.LENGTH_SHORT).show()
                }
            }
        })

    }

    private fun setupRecyclerView(){
        rv_cocteles.layoutManager = LinearLayoutManager(requireContext())
        rv_cocteles.addItemDecoration(DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL))
    }

}