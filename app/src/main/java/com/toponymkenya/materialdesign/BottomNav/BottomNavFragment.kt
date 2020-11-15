package com.toponymkenya.materialdesign.BottomNav

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.toponymkenya.materialdesign.R

class BottomNavFragment : Fragment(), BottomNavigationView.OnNavigationItemSelectedListener {
    var bottonNav : BottomNavigationView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottom_nav, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bottonNav = view.findViewById(R.id.bottom_navigation)
        bottonNav?.setOnNavigationItemSelectedListener(this)

        val badge = bottonNav?.getOrCreateBadge(R.id.action_home)
        badge?.isVisible = true
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.action_home -> {
                Toast.makeText(context, "home", Toast.LENGTH_SHORT).show()
                val badgeDrawable = bottonNav?.getBadge(id)
                badgeDrawable?.run {
                    isVisible = false
                }
                true
            }
            R.id.action_search -> {
                Toast.makeText(context, "search", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_settings -> {
                Toast.makeText(context, "settings", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_notifications -> {
                Toast.makeText(context, "notification", Toast.LENGTH_SHORT).show()
                true
            }
            else -> false

        }

    }

    companion object {
        private const val TAG = "BottomNavFragment"
    }
}