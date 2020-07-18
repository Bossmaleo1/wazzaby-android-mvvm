package com.wazzaby.android.view

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.wazzaby.android.R
import com.wazzaby.android.databinding.FragmentLoginViewBinding
import com.wazzaby.android.viewmodel.LoginViewModel


class LoginViewFragment : Fragment() {

    private lateinit var viewModel: LoginViewModel
    private lateinit var loginviewfragmentbinding : FragmentLoginViewBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        setHasOptionsMenu(true)

        loginviewfragmentbinding = DataBindingUtil.inflate(inflater, R.layout.fragment_login_view, container,false)

        (activity as AppCompatActivity?)!!.setSupportActionBar(loginviewfragmentbinding.toolbar)
        val actionbar = (activity as AppCompatActivity?)!!.supportActionBar
        actionbar!!.title =  "Wazzaby"
        actionbar!!.setDisplayHomeAsUpEnabled(false)
        actionbar!!.setDisplayShowHomeEnabled(true)




        return loginviewfragmentbinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)

        loginviewfragmentbinding.viewModel = viewModel
        loginviewfragmentbinding.lifecycleOwner = this





        //method to custom onBackPressed in our Fragment
        val callback: OnBackPressedCallback =
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {

                    val intent = Intent(Intent.ACTION_MAIN)
                    intent.addCategory(Intent.CATEGORY_HOME)
                    intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                    startActivity(intent)
                    System.exit(0)
                }
            }

        requireActivity().getOnBackPressedDispatcher().addCallback(this, callback)

        loginviewfragmentbinding.connexion.setOnClickListener {
            viewModel.message.observe(this, Observer {
                it.getContentIfNotHandled()?.let {
                    Toast.makeText(activity,it,Toast.LENGTH_LONG).show()
                }

            })

        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_inscript,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){

            R.id.inscript -> {

            }
        }

        return super.onOptionsItemSelected(item)
    }






}